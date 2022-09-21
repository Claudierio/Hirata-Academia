<template>
  <div>
    <Navbar :logo="logo_src" :alt="app_name" />
    <div>
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar'
export default {
  components: {
    Navbar,
  },
  data(){
    return{
      logo_src: "/img/icons/logo.png",
      app_name: "Hirata Academia"

    }
  }
}
</script>

