<template>
 <div class="main-container">
    <v-card>
      <br><br><br>
      <v-card-title>
        <v-text-field
          v-model="procurar"
          append-icon="mdi-magnify"
          label="Procurar Contador"
          single-line
          hide-details
        ></v-text-field>
      </v-card-title>
      <v-data-table
        :headers="headers"
        :items="contadores"
        :search="procurar"
      ></v-data-table>
    </v-card>
  </div>
</template>

<script>
import ContadorService from '@/service/ContadorService';
  export default {
    data () {
      return {
        procurar: '',
        contadores: [],
        headers: [
        {text:'ID', value:'id'},
        {text:'CRC', value:'crc'},
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
        ContadorService.getAll().then(
          response => {
            this.contadores = response.data;
          }
        )
      },
    },
    mounted() {
      this.loadAll();
    }
  }
</script>