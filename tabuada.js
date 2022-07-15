console.log("primeira linha do arquivo js")

function calcular(){
    //pega o valor do input
    let tab1 = document.getElementById("tab1").value;
    let tab2 = document.getElementById("tab2").value;

    //validação dos valores caso o primerio seja menor q o segundo
    if(tab2<tab1){
        let aux = tab2;
        tab2 = tab1;
        tab1 = aux;
    }
    //criar um elemento UL no HTML da pagina
    const container = document.createElement("ul");

    //laço responsavel por gerenciar quantas vezes vai rodar a tabuada
    do{

        for (let index = 1; index <=10; index++){
            let linha = document.createElement("li");
            linha.className = "tab" + tab1
            let result = tab1 + " X " + index + " = " + tab1*index;
            linha.appendChild(document.createTextNode(result));
            container.appendChild(linha);

            
        }
        tab1++;
       
    }while(tab1<=tab2)
    //adicionando o container dentro do elemento body
    document.body.appendChild(container);







}
