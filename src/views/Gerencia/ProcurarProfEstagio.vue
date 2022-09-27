<template>
  <div class="main-container">
    <v-card>
      <v-card-title>
        <v-text-field
          v-model="search"
          append-icon="mdi-magnify"
          label="Search"
          single-line
          hide-details
        ></v-text-field>
      </v-card-title>
      <v-data-table
        :headers="headers"
        :items="desserts"
        :search="search"
      ></v-data-table>
    </v-card>
  </div>
</template>

<script>
//import ContadorService from '@/services/ContadorService'
  export default {
    data () {
      return {
        search: '',
        ProfsEstagiarios: [],
        headers: [
        {text:'ID', value:'id'},
        {text:'Inicio Estagio', value:'estagio'},
        {text:'Nome', value:'nome'},
        {text:'CPF', value:'cpf'},
        {text:'Telefone', value:'telefone'},
        {text:'Cidade', value:'Endereco.cidade'},
        {text:'UF', value:'Endereco.estado'},

        ],
      }
    },
    /*methods: {
      loadAll(){
        ContadorService.getAll().then(
          response => {
            this.ProfsEstagiarios = response.data;
          }
        )
      },
    },
    mounted() {
      this.loadAll();
    }*/
  }
</script>