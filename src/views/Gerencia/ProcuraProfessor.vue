<template>
    <form action="action_page.php">
  <div class="container">
    <h1>Procurar Professor</h1>
    <p>Insira o CREF do professor.</p>
    <hr>

    <label for="cref"><b>CREF</b></label>
    <input type="text" placeholder="Digite o CREF" name="cref" id="cref" required>
    <hr>

    <button type="consultar" class="consultarbtn">Procurar</button>
  </div>
</form>
</template>

<style scoped>
    * {box-sizing: border-box}

/* Add padding to containers */
.container {
  padding: 18px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.consultarbtn {
  background-color: red;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.consultarbtn:hover {
  opacity:1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

</style>