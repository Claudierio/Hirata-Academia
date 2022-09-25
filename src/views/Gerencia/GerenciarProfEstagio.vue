<template>

    <body>
        <div class="container">
            <button class="btn1"><router-link to="/AtualizarProfEstagiario">Atualizar Estagiário</router-link></button>
            <button class="btn2"><router-link to="/ProcurarProfEstagiario">Procurar Estagiário</router-link></button>
            <button class="btn3"><router-link to="/DemitirProfEstagiario">Demitir Estagiário</router-link></button>
            <button class="btn4"><router-link to="/CadastrarProfEstagiario">Cadastrar Estagiário</router-link></button>
            <button class="btn5"><router-link to="/EfetivarProfEstagio">Efetivar Estagiário</router-link></button>
        </div>
    </body>
  </template>
  
  <style scoped>
    * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  
  .container {
    background-color: #EDF2F4;
    width: 100%;
    height: 100vh;
    display: grid;
    justify-items: center;
    align-items: center;
  }
  
  .btn1 {
    position: absolute;
    background-color: #181D38;
    color: #697292;
    width: 10rem;
    height: 4rem;
    border-radius: 3rem;
    border-style: none;
    cursor: pointer;
    font-size: 1.2rem;
    font-weight: 800;
    text-transform: uppercase;
    font-family: sans-serif;
    box-shadow: 0 307px 290px 0 #070A1E;
    top: 40%;
    left: 5%;
  }
  
  .btn1:hover {
    background-color: rgba(24, 29, 56,0.8);
    color: rgba(105, 114, 146,0.8);
    border: 3px solid #697292;
  }
  .btn2 {
    position: absolute;
    background-color: #181D38;
    color: #697292;
    width: 10rem;
    height: 4rem;
    border-radius: 3rem;
    border-style: none;
    cursor: pointer;
    font-size: 1.2rem;
    font-weight: 800;
    text-transform: uppercase;
    font-family: sans-serif;
    box-shadow: 0 307px 290px 0 #070A1E;
    top: 40%;
    left: 25%;
  }
  
  .btn2:hover {
    background-color: rgba(24, 29, 56,0.8);
    color: rgba(105, 114, 146,0.8);
    border: 3px solid #697292;
  }
  .btn3 {
    position: absolute;
    background-color: #181D38;
    color: #697292;
    width: 10rem;
    height: 4rem;
    border-radius: 3rem;
    border-style: none;
    cursor: pointer;
    font-size: 1.2rem;
    font-weight: 800;
    text-transform: uppercase;
    font-family: sans-serif;
    box-shadow: 0 307px 290px 0 #070A1E;
    top: 40%;
    left: 45%;
  }
  
  .btn3:hover {
    background-color: rgba(24, 29, 56,0.8);
    color: rgba(105, 114, 146,0.8);
    border: 3px solid #697292;
  }
  .btn4 {
    position: absolute;
    background-color: #181D38;
    color: #697292;
    width: 10rem;
    height: 4rem;
    border-radius: 3rem;
    border-style: none;
    cursor: pointer;
    font-size: 1.2rem;
    font-weight: 800;
    text-transform: uppercase;
    font-family: sans-serif;
    box-shadow: 0 307px 290px 0 #070A1E;
    top: 40%;
    left: 65%;
  }
  
  .btn4:hover {
    background-color: rgba(24, 29, 56,0.8);
    color: rgba(105, 114, 146,0.8);
    border: 3px solid #697292;
  }
  .btn5 {
    position: absolute;
    background-color: #181D38;
    color: #697292;
    width: 10rem;
    height: 4rem;
    border-radius: 3rem;
    border-style: none;
    cursor: pointer;
    font-size: 1.2rem;
    font-weight: 800;
    text-transform: uppercase;
    font-family: sans-serif;
    box-shadow: 0 307px 290px 0 #070A1E;
    top: 40%;
    left: 85%;
  }
  
  .btn5:hover {
    background-color: rgba(24, 29, 56,0.8);
    color: rgba(105, 114, 146,0.8);
    border: 3px solid #697292;
  }
  </style>
  