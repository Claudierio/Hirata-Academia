<template>
    <div>
      <div id="nav">
        <router-link id="logo-url" to="/">
          <img id="logo" :src="logo" :alt="alt">
        </router-link>
        <router-link to ="/">Home</router-link>
        <router-link to="/AreaAluno">Área do Aluno</router-link>
        <router-link to="/AreaEfetivo">Área Efetivo</router-link>
        <router-link to="/Planos">Planos</router-link>

      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: "Navbar-navbar", //barra de navegação
    props: ["logo", "alt"] 
  }
  </script>
  
  <style scoped>
    #nav {
      background-color: #21232d;
      border-bottom: 4px solid #111;
      padding: 15px 50px;
      display: flex;
      justify-content: flex-end;
      align-items: center;
    }
    #nav #logo-url {
      margin: auto;
      margin-left: 0;
    }
    #logo {
      width: 50px;
      height: 50px;
    }
    #nav a {
      color: #FFF;
      text-decoration: none;
      margin: 12px;
      transition: .5s;
    }
    #nav a:hover {
      
      color: #c90707;
    }
  </style>