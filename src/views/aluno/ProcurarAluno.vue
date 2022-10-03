<template>
  <div class="main-container">
    <v-card>
      <br><br><br>
      <v-card-title>
        <v-text-field
          v-model="procurar"
          append-icon="mdi-magnify"
          label="Procurar Aluno"
          single-line
          hide-details
        ></v-text-field>
      </v-card-title>
      <v-data-table
        :headers="headers"
        :items="alunos"
        :search="procurar"
      ></v-data-table>
    </v-card>
  </div>
</template>

<script>
import AlunoService from '@/service/AlunoService';
  export default {
    data () {
      return {
        procurar: '',
        alunos: [],
        headers: [
        {text:'ID', value:'id'},
        {text:'Nome', value:'nome'},
        {text:'CPF', value:'cpf'},
        {text:'Telefone', value:'contato'},
        {text:'Plano', value:'plano'},
        {text:'Cidade', value:'endereco.municipio'},
        {text:'UF', value:'endereco.uf'},

        ],
      }
    },
    methods: {
      loadAll(){
        AlunoService.getAll().then(
          response => {
            this.alunos = response.data;
          }
        )
      },
    },
    mounted() {
      this.loadAll();
    }
  }
</script>