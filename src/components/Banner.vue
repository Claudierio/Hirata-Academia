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
  background-size: 100%;
  background-position: center;
  height: 600px;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  width: 100%;
  margin: 10px auto;

}

#main-banner h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  text-shadow: #c2c2c2;
  font-size: 60px;
  padding: 20px 60px;
  color: #c2c2c2;
      text-shadow: 
               -3.5px -3.5px 0px #000, 
               -3.5px 3.5px 0px #000,                    
                3.5px -3px 0px #000,                  
                0.5px 0px 0px #000;

}

</style>