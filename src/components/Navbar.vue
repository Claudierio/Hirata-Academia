<template>
  <div>
    <div id="nav">
      <v-app-bar app id="nav">
        <v-app-bar-nav-icon
          @click="drawer = !drawer"
          color="white"
        ></v-app-bar-nav-icon>

        <router-link id="logo-url" to="/">
          <img id="logo" :src="logo" :alt="alt" />
        </router-link>
        <router-link to="/">Home</router-link>
        <router-link to="/AreaAluno">Área do Aluno</router-link>
        <router-link to="/AreaEfetivo">Área Efetivo</router-link>
        <router-link to="/Planos">Planos</router-link>
      </v-app-bar>

      <!--Barra de William-->
      <v-navigation-drawer v-model="drawer" app id="nav">
        <v-list-item>
          <v-list-item-content>
            <v-list-item-title class="text-h6"> AAAAAAAAAAA </v-list-item-title>
            <v-list-item-subtitle> BBBBBBBBBBB </v-list-item-subtitle>
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
        title: "Texto que vai aparecer ",
        icon: "mdi-account",
        to: "/linkdepraondevai",
      },
      {
        title: "Texto que vai aparecer ",
        icon: "mdi-account",
        to: "/linkdepraondevai",
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
#nav a:hover {
  color: #c90707;
}
</style>