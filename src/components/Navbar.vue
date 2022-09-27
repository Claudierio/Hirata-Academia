<template>
  <div>
    <div id="nav">
      <v-app-bar app id="nav">
        <v-app-bar-nav-icon @click="drawer = !drawer" color=#ffff ></v-app-bar-nav-icon>
        <router-link id="logo-url" to="/">
          <img id="logo" :src="logo" :alt="alt" />
        </router-link>
        <router-link to="/">Home</router-link>
        <div class="dropdown">
          <button class="dropbtn">Área do Aluno
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="dropdown-content">
            <router-link to="/VisualizarFicha">Consultar</router-link>
            <router-link to="/CadastrarAluno">Cadastrar</router-link>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropbtn">Área Efetivo
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="dropdown-content">
            <router-link to="/GerenciarFicha">Professor</router-link>
            <router-link to="/CalculoLucroAnual">Contador</router-link>
          </div>
        </div>
        <router-link to="/Planos">Planos</router-link>
      </v-app-bar>

      <!--Barra de William-->
      <v-navigation-drawer v-model="drawer" app id="nav" color="white">
        <v-list-item>
          <v-list-item-content class="text-h6">
            <v-list-item-title> HIRATA  ACADEMIA </v-list-item-title>
            <v-list-item-title> MENU </v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-divider></v-divider>

        <template>
          <v-card class="mx-auto" width="300" id="nav">
            <v-list dense nav>
              <v-list-item v-for="item in items" :key="item.title" :to="item.to" link>
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
        title: "Criar Ficha de Treino ",
        icon: "mdi-account",
        to: "/CriarFichaTreino1",
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
  color: white;
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


.text-h6 {
  color: #fff;
  text-align: center;
  font-size:10
}

.text-h6:hover {
  color: #c90707;
}
</style>