<template>
  <div id="footer">
  <img src="" alt="">
  <img id="logo" :src="logo" :alt="alt">
    <p>HIRATA ACADEMIA &copy; 2022</p>
    <p></p>
  </div>
</template>

<script>
export default {
  name: "Footer-footer",
  props: ["logo", "alt"] 
}
</script>

<style scoped>
  #footer {
    height: 170px;
    background-color: #21232d;
    border-top: 4px solid #111;
    color: #c90707;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
    bottom: 0;
    width: 100%;
  }
  
  #logo {
    width: 50px;
    height: 50px;
  }
</style>