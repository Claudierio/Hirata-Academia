<template>
  <div>
    <Navbar :logo="logo_src" :alt="app_name" />
    <div>
      <router-view></router-view>
    </div>
    <Footer :logo="logo_src" :alt="app_name" />
  </div>
</template>
<script>
import Navbar from './components/Navbar'
import Footer from './components/Footer'
export default {
  data: function() {
    return {
      logo_src: "/img/icons/logo2.png",
      app_name: "Hirata Academia"
    }
  },
  components: {
    Navbar,
    Footer
  }
}
</script>

<style>
  * {
    font-family: Arial, Helvetica;
    padding: 0;
    margin: 0;
    box-sizing: border-box;
  }
  .main-container { /*Como essa classe  já está em dois componentes eu já posso utiliza-lo no meu app, assim eu não tenho uma replicação de estilo*/
    margin: 50px;
    min-height: 350px;
  }
  h1 { /*Todos os h1 da página virão com essa configuração */
    text-align: center;
    font-size: 42px;
    margin-bottom: 30px;
    color: #222;
  }
</style>