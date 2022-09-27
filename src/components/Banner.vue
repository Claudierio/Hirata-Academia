<template>
  <div id="main-banner">
    <h1>MUDE SEU ESTILO <br>COM A GENTE!</h1>
  </div>
</template>

<script>
  export default {
    name: "Banner_"
  }
</script>

<style scoped>
#main-banner {
  background-image: url('banner3.jpg');
  background-size: cover;
  height: 540px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  width: 100%;
  margin: 30px auto;


  
}
#main-banner h1 {
  color: #ffffff;
  font-family: Arial, Helvetica, sans-serif;
  text-align: center;
  font-size: 60px;
  padding: 20px 60px;
}


</style>