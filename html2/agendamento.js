var csv ="";

function montartabela(lista){
    var saida = 
    `<table class='table' border='1' align='center'> <tr><th scope='col'>Agência</th><th scope='col'>Cliente</th><th scope='col'>Email</th><th scope='col'>Telefone</th><th scope='col'>Data</th><th scope='col'>Hora</th><th scope='col'>Obs</th></tr>`;
    csv = 'agencia, nome, email, celular, data, hora, observacao\n';

    for(cont=0;cont<lista.length;cont++){

        saida +=
        "<tr>" +
        "<td scope='row'>" + lista[cont].agencia.nomeAgencia + "</td>" +
        "<td scope='row'>" + lista[cont].nomeCliente + "</td>" +
        "<td scope='row'>" + lista[cont].emailCliente + "</td>" +
        "<td scope='row'>" + lista[cont].celularCliente + "</td>" +
        "<td scope='row'>" + lista[cont].dataAgendamento + "</td>" +
        "<td scope='row'>" + lista[cont].horaAgendamento + "</td>" +
        "<td scope='row'>" + lista[cont].observacao + "</td>" +
        "</tr>";

        csv += lista[cont].agencia.nomeAgencia+","+lista[cont].nomeCliente+","+lista[cont].emailCliente+","+lista[cont].celularCliente+","+lista[cont].dataAgendamento+","+lista[cont].horaAgendamento+","+lista[cont].observacao+"\n";

    }

    saida += "</table>";
    document.getElementById("resultado").innerHTML=saida;



}

function gerarcsv(){
    var hiddenElement = document.createElement('a');
    hiddenElement.href = 'data:text/csv;charset=utf-8,' + encodeURI(csv);
    hiddenElement.target = '_blank';
    hiddenElement.download = 'agendamento.csv';
    hiddenElement.click();
}


function filtrar(){
    var rota = "relatoriopor";

    
    var databr2 = "";   
        if (document.getElementById("chkagencia").checked==true){
            rota+="agencia";
        }
        if (document.getElementById("chkdata").checked==true){
            rota+="data";
            var data=document.getElementById("txtdata2").value;
            var ano = data.substring(0,4);
            var mes = data.substring(5,7);
            var dia = data.substring(8);
            databr2 = dia + "/" + mes + "/" + ano;
            console.log(databr2);
        }
        if (document.getElementById("chkcliente").checked==true){
            rota+="cliente";
        
        }

        
        var objeto= {
            "nomeCliente" : document.getElementById("txtcliente2").value ,
            "dataAgendamento" : databr2,
            agencia : {
                id : document.getElementById("cmbagencia").value
            }
        };

        var cabecalho = {
            method:"POST",
            body : JSON.stringify(objeto),
            headers : {
                "content-type" : "application/json"
            }
        }   
        if (rota == "relatoriopor"){
            fetch("http://localhost:8080/" + rota)
            .then(res => res.json())
            .then(res => montartabela(res)); 
            
        }else{
        fetch("http://localhost:8080/" + rota, cabecalho)
            .then(res => res.json())
            .then(res => montartabela(res))
            .catch(err => {
                window.alert("Não existem agendamentos com os critérios solicitados.");
        }); }
      
}



function inicio(){
    carregargerente();
    carregaragencia();
}


function carregargerente(){
    var usuariologado = localStorage.getItem("logado");
    if(usuariologado == null){
        window.location="logingerente.html";
    } else{
        var usuariojson = JSON.parse(usuariologado);
        document.getElementById("foto").innerHTML=
        "<img alt='Foto nao encontrada' src=imagens/" + usuariojson.foto + " class='img-fluid'>";
        document.getElementById("dados").innerHTML=
        "<h4> Nome: " + usuariojson.nome + "<br> Email:  " + usuariojson.email + "<br> RACF:  " + usuariojson.racf + "<br> </h4>";
    }
    
}


function atualizahorarios(){
 

    var objeto = {
        "id": document.getElementById("cmbagencia").value
    }

    var cabecalho = {
        method: "POST",
        body: JSON.stringify(objeto),
        headers: {
            "Content-type":"application/json"
        }
    }
    fetch("http://localhost:8080/agenciaid", cabecalho)
    .then(res => res.json())
    .then(res => {
        localStorage.setItem("agenciaatual", JSON.stringify(res));
    }) 

        var agJson = JSON.parse(localStorage.getItem("agenciaatual"));
        document.getElementById("txtini").value = agJson.horaInicio;
        document.getElementById("txtfim").value = agJson.horaFim;

     delete objeto;
     
}



function carregaragencia(){
    fetch("http://localhost:8080/agencias")
    .then(res => res.json())
    .then(res => preencheragencia(res));

}

function preencheragencia(lista){
    var saida = "<option value='-1' selected> Escolha agência </option>;";
    for(cont=0;cont<lista.length;cont++){
        saida+=
        "<option value='"+ lista[cont].id +"'>" + lista[cont].nomeAgencia + "</option>";
    }
    document.getElementById("cmbagencia").innerHTML=saida;
  
}

function gravar(){

    var data = document.getElementById("txtdata").value;
    var ano = data.substring(0,4);
    var mes = data.substring(5,7);
    var dia = data.substring(8);

    var databr = dia+ "/" + mes + "/" + ano;
 
    var objeto = {
        "nomeCliente": document.getElementById("txtcliente").value,
        "emailCliente": document.getElementById("txtemail").value,
        "celularCliente": document.getElementById("txtcelular").value,
        "horaAgendamento": document.getElementById("txthora").value,
        "observacao": document.getElementById("txtobs").value,
        "dataAgendamento": databr,
        "agencia": { "id" : document.getElementById("cmbagencia").value }
    }



    var cabecalho = {
        method: "POST",
        body: JSON.stringify(objeto),
        headers: {
            "Content-type":"application/json"
        }
    }
    fetch("http://localhost:8080/novoagendamento", cabecalho)
    .then(res => res.json())
    .then(res => {window.alert("Agendamento efetuado com sucesso")})
    .catch(err => {window.alert("Erro no agendamento")});

    
}


function deslogar(){
    localStorage.removeItem("logado");
    window.location="logingerentes.html";
}