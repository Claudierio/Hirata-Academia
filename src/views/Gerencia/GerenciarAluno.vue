<template>

  <body>
      <div class="container">
          <button class="btn1"><router-link to="/AtualizarAluno">Atualizar Aluno</router-link></button>
          <button class="btn2"><router-link to="/ProcurarAluno">Procurar Aluno</router-link></button>
          <button class="btn3"><router-link to="/RemoverAluno">Remover Aluno</router-link></button>
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
  left: 25%;
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
  left: 45%;
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
  left: 65%;
}

.btn3:hover {
  background-color: rgba(24, 29, 56,0.8);
  color: rgba(105, 114, 146,0.8);
  border: 3px solid #697292;
}
</style>