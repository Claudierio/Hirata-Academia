<template>
  <div class="main-container">
    <v-card>
      <br><br><br>
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
        :items="professores"
        :search="search"
      ></v-data-table>
    </v-card>
  </div>
</template>

<script>
import ProfessorService from '@/service/ProfessorService';
  export default {
    data () {
      return {
        search: '',
        professores: [],
        headers: [
        {text:'ID', value:'id'},
        {text:'CREF', value:'cref'},
        {text:'Nome', value:'nome'},
        {text:'CPF', value:'cpf'},
        {text:'Telefone', value:'contato'},
        {text:'Cidade', value:'endereco.municipio'},
        {text:'UF', value:'endereco.uf'},
        {text:'Salario', value:'salario'},

        ],
      }
    },
    methods: {
      loadAll(){
        ProfessorService.getAll().then(
          response => {
            this.professores = response.data;
          }
        )
      },
    },
    mounted() {
      this.loadAll();
    }
  }
</script>