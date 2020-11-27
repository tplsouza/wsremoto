function montartabela(lista){
    var saida = 
    "<table border='1' align='center'> <tr>" + 
    "<th> Agência </th> <th>Cliente</th> <th>Email</th>  <th> Telefone </th> <th> Data </th> </tr>";

    for(cont=0;cont<lista.length;cont++){

        saida +=
        "<tr>" +
        "<td>" + lista[cont].agencia.nomeAgencia + "</td>" +
        "<td>" + lista[cont].nomeCliente + "</td>" +
        "<td>" + lista[cont].emailCliente + "</td>" +
        "<td>" + lista[cont].celularCliente + "</td>" +
        "<td>" + lista[cont].dataAgendamento + "</td>" +
        "</tr>";
    }

    saida += "</table>";
    document.getElementById("resultado").innerHTML=saida;

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
        if (cabecalho == null){
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
        "<img alt='Foto nao encontrada' src=imagens/" + usuariojson.foto + ">";
        document.getElementById("dados").innerHTML=
        "<h2>" + usuariojson.nome + "<br>" + usuariojson.email + "<br> " + usuariojson.racf + "<br> </h3>";
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
     
     
}



function carregaragencia(){
    fetch("http://localhost:8080/agencias")
    .then(res => res.json())
    .then(res => preencheragencia(res));

}

function preencheragencia(lista){
    var saida = "";
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

