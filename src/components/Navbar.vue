<template>
  <div>
    <div id="nav">
      <v-app-bar app id="nav">
        <v-app-bar-nav-icon
        @click="drawer = !drawer" color="white"
        ></v-app-bar-nav-icon>

        <router-link id="logo-url" to="/">
          <img id="logo" :src="logo" :alt="alt" />
        </router-link>
        <div class="dropdown11">
        <div class="dropbtnone">Área Efetivo</div>
        <!--  Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">Gerente
            <!--  Inside Dropdown -->
            <div class="dropdown-two">
              <div class="dItem" id="file" href="#">
                <router-link to="/GerenciarAluno">Gerenciar Aluno</router-link>
              </div>
              <div class="dItem" id="file" href="#">
                <router-link to="/GerenciarProfessor">Gerenciar Professor</router-link>
              </div>
              <div class="dItem" id="file" href="#">
                <router-link to="/GerenciarEstagiario">Gerenciar Estagiário</router-link>
              </div>
              <div class="dItem" id="file" href="#">
                <router-link to="/GerenciarContador">Gerenciar Contador</router-link>
              </div>
            </div>
          </div>
          <div class="dItem" href="#"><router-link to="/GerenciarFicha">Professor</router-link></div>
          <div class="dItem" href="#"><router-link to="/CalculoLucroAnual">Contador</router-link></div>
        </div>
      </div> 
      <div class="dropdown11">
        <div class="dropbtnone">Área Aluno</div>
        <!--  Main Dropdown -->
        <div class="dropdown-one">
          <div id="link1" class="dItem" href="#">
            <router-link to="/VisualizarFicha">Consultar</router-link>
          </div>
          <div class="dItem" href="#">
            <router-link to="/CadastrarAluno">Cadastrar</router-link>
          </div>
        </div>
      </div> 
        <router-link to="/Planos">Planos</router-link>
        <router-link to="/">Home</router-link>
      </v-app-bar>

      <!--Barra de William-->
      <v-navigation-drawer v-model="drawer" app id="nav" >
        <v-list-item>
          <v-list-item-content class="text-h6">
            <v-list-item-title> HIRATA ACADEMIA </v-list-item-title>
            <div class="testenav">
              <v-list-item-subtitle>MENU</v-list-item-subtitle>
            </div>
          </v-list-item-content>
        </v-list-item>

        <v-divider></v-divider>

        <template>
          <v-card class="mx-auto" width="300" id="nav">
            <v-list dense nav>
              <v-list-item
                v-for="item in items"
                :key="item.title"
                :to="item.to"
                link
              >
                <v-list-item-icon>
                  <v-icon>{{ item.icon }}</v-icon>
                </v-list-item-icon>

                <v-list-item-content>
                  <v-list-item-title>{{ item.title }}</v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-card>
        </template>
      </v-navigation-drawer>
    </div>
  </div>
</template>

<script>
export default {
  data: () => ({
    items: [
    {
        title: "Planos ",
        icon: "mdi-account",
        to: "/Planos",
      },
      {
        title: "Cadastrar Aluno ",
        icon: "mdi-account",
        to: "/CadastrarAluno",
      },
      {
        title: "Atualizar Aluno ",
        icon: "mdi-account",
        to: "/AtualizarAluno",
      },
      {
        title: "Procurar Aluno ",
        icon: "mdi-account",
        to: "/ProcurarAluno",
      },
      {
        title: "Remover Aluno ",
        icon: "mdi-account",
        to: "/RemoverAluno",
      },
      {
        title: "Visualizar Ficha de Treino ",
        icon: "mdi-account",
        to: "/VisualizarFicha",
      },
      {
        title: "Cadastrar Professor ",
        icon: "mdi-account",
        to: "/CadastrarProfessor",
      },
      {
        title: "Atualizar Professor ",
        icon: "mdi-account",
        to: "/AtualizarProfessor",
      },
      {
        title: "Demitir Professor ",
        icon: "mdi-account",
        to: "/DemitirProfessor",
      },
      {
        title: "Procurar Professor ",
        icon: "mdi-account",
        to: "/ProcurarProfessor",
      },
      {
        title: "Cadastrar Professor Estagiário",
        icon: "mdi-account",
        to: "/CadastrarProfEstagiario",
      },
      {
        title: "Efetivar Professor Estagiário",
        icon: "mdi-account",
        to: "/EfetivarProfEstagio",
      },
      {
        title: "Demitir Professor Estagiário",
        icon: "mdi-account",
        to: "/DemitirProfEstagiario",
      },
      {
        title: "Procurar Professor Estagiário",
        icon: "mdi-account",
        to: "/ProcurarProfEstagiario",
      },
      {
        title: "Cadastrar Contador",
        icon: "mdi-account",
        to: "/CadastrarContador",
      },
      {
        title: "Atualizar Contador",
        icon: "mdi-account",
        to: "/AtualizarContador",
      },
      {
        title: "Procurar Contador",
        icon: "mdi-account",
        to: "/ProcurarContador",
      },
      {
        title: "Demitir Contador",
        icon: "mdi-account",
        to: "/DemitirCont",
      },
      {
        title: "Calculo Lucro Anual",
        icon: "mdi-account",
        to: "/CalculoLucroAnual",
      },
    ],

    drawer: false,
    right: null,
  }),
  name: "Navbar-navbar", //barra de navegação
  props: ["logo", "alt"],
};
</script>

<style scoped>
#nav {
  background-color: #21232d;
  border-bottom: 4px solid #111;
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
  color: #fff;
  text-decoration: none;
  margin: 12px;
  transition: 0.5s;
}
/* The dropdown container */
.dropdown {
  float: left;
  overflow: hidden;
}

/* Dropdown button */
.dropdown .dropbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  /* Important for vertical align on mobile phones */
  margin: 0;
  /* Important for vertical align on mobile phones */
}
#nav a:hover {
  color: #c90707;
}
/* Dropdown content (hidden by default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #21232d;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
  background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
  display: block;
}

.nav .text-h6 {
  color: #fff;
}

.text-h6:hover {
  color: #c90707;
}

.nav .text-h6 .testenav {
  color: #fff;
}
/* */
.dropdown11 {
    float: left;
    position: relative;
}

.dropdown11 .dropbtnone {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.navbar a:hover, .dropdown11:hover .dropbtnone {
    background-color: #21232d;
}

.dropdown-one {
  cursor: pointer;
  display: none;
  position: absolute;
  background-color: #21232d;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-two {
  cursor: pointer;
  display: none;
  position: absolute;
  left: 160px;
  top: 0px;
  min-width: 160px;
  background-color: #21232d;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown11:hover .dropdown-one, #link1:hover > .dropdown-two {
  display: block;
}

.dropdown-one .dItem {
    color: #fff;
    padding: 12px 16px;
    display: block;
    text-align: left;
}

.dropdown-one .dItem:hover, .dropdown-two a:hover {
    background-color: #EDF2F4;
    color: red;
}
</style>