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
    background-image: url('banner1.jpg');
    background-size: cover;
    height: 500px;
    display: flex;
    align-items: center;
    justify-content: flex-start;
    
  }
  #main-banner h1 {
    color: #ffffff;
    font-family: Arial, Helvetica, sans-serif;
    text-align: center;
    font-size: 60px;
    padding: 20px 40px;
  }
</style>