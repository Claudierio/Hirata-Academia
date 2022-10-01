<template>
  <div class="main-container">
    <br><br><br>
    <v-data-table :headers="headers" :items="desserts" sort-by="calories" class="elevation-1">
      <template v-slot:top>
        <v-toolbar flat>
          <v-toolbar-title>Informações do Aluno</v-toolbar-title>
          <v-divider class="mx-4" inset vertical></v-divider>
          <v-spacer></v-spacer>
          <v-dialog v-model="dialog" max-width="500px">
            <template v-slot:activator="{ on, attrs }">
              <v-btn color="primary" dark class="mb-2" v-bind="attrs" @click="CadastrarAluno" v-on="on">
                Cadastrar Novo aluno
              </v-btn>
            </template>
            <v-card>
              <v-card-title>
                <span class="text-h5">{{ formTitle }}</span>
              </v-card-title>

              <v-card-text>
                <v-container>
                  <v-row>
                    <v-col cols="12" sm="6" md="4">
                      <v-text-field v-model="editedItem.nome" :rules="nameRules" label="Nome">
                      </v-text-field>
                    </v-col>
                    <v-col cols="12" sm="6" md="4">
                      <v-text-field v-model="editedItem.contato" :rules="telefoneRules"
                        type="text" label="Contato"></v-text-field>
                    </v-col>
                    <v-col cols="12" sm="6" md="4">
                      <v-text-field v-model="editedItem.endereco.municipio" :rules="cidadeRules" label="Municipio">
                      </v-text-field>
                    </v-col>
                    <v-col cols="12" sm="6" md="4">
                      <v-text-field  v-model="editedItem.endereco.uf" label="UF">
                      </v-text-field>
                    </v-col>
                    <v-col cols="12" sm="6" md="4">
                      <v-text-field v-model="editedItem.treino.descricao" :rules="treinoRules" label="Treino">
                      </v-text-field>
                    </v-col>

                  </v-row>
                </v-container>

              </v-card-text>

              <v-card-actions>
                <v-spacer></v-spacer>
                <v-btn color="blue darken-1" text @click="close">
                  Cancelar
                </v-btn>
                <v-btn color="blue darken-1" text @click="save">
                  Salvar
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-dialog>
          <v-dialog v-model="dialogDelete" max-width="530px">
            <v-card>
              <v-card-title class="text-h9">Você tem certeza que deseja remover esse Aluno?</v-card-title>
            </v-card>
          </v-dialog>
        </v-toolbar>

      </template>
      <template v-slot:[`item.actions`]="{ item }">
        <v-icon small class="mr-2" @click="editItem(item)">
          mdi-pencil
        </v-icon>
        <v-icon small @click="deleteItem(item)">
          mdi-delete
        </v-icon>
      </template>
      <template v-slot:no-data>
        <v-btn color="primary" @click="initialize">
          Resetar
        </v-btn>

      </template>

    </v-data-table>
  </div>
</template>

<script>
import AlunoService from '@/service/AlunoService'
export default {
  data: () => ({
    dialog: false,
    dialogDelete: false,
    search: '',
    headers: [
      { text: 'ID', value: 'id' },
      { text: 'Nome', value: 'nome' },
      { text: 'CPF', value: 'cpf' },
      { text: 'Telefone', value: 'contato' },
      { text: 'Cidade', value: 'endereco.municipio' },
      { text: 'UF', value: 'endereco.uf' },
      { text: 'Plano', value: 'plano'},
      { text: 'Treino', value: 'treino.descricao'},
    ],
    nameRules: [
      v => !!v || 'Campo Obrigatorio',
      v => !!v.length || 'Campo Obrigatorio',
      v => v.length >= 4 && v != null || 'Informe seu nome completo',
    ],
    telefoneRules: [
      v => !!v || 'Campo Obrigatorio',
      v => v.length >= 15 && v.length <= 15 && v != null || 'Telefone Invalido',
    ],
    cidadeRules: [
      v => !!v || 'Campo Obrigatorio',
      v => v.length > 0 && v != null || 'Informe o nome completo',
    ],
    ruaRules: [
      v => !!v || 'Campo Obrigatorio',
      v => v.length > 0 && v != null || 'Informe o nome completo',
    ],
    treinoRules: [
      v => !!v || 'Campo Obrigatorio',
      v => v.length > 0 && v != null || 'Informe o treino completo',
    ],
    desserts: [],
    editedIndex: -1,
    editedItem: {

      nome: '',
      telefone: '',
      cpf: '',
      endereco: {
        municipio: '',
        uf: '',
      },
      treino: {
        descricao: '',
      }
    },
    defaultItem: {

      nome: '',
      cpf: '',
      telefone: '',
      endereco: {
        municipio: '',
        uf: '',
      },
      treino: {
        descricao: '',
      }
    },
  }),
  computed: {
    formTitle() {
      return this.editedIndex === -1 ? 'New Item' : 'Editar Aluno'
    },
  },
  watch: {
    dialog(val) {
      val || this.close()
    },
    dialogDelete(val) {
      val || this.closeDelete()
    },
  },
  created() {
    this.initialize()
  },
  methods: {
    initialize() {
      this.desserts = [
      ]
    },
    loadAll() {
      AlunoService.getAll().then(
        response => {
          this.desserts = response.data;
        }
      );
    },
    editItem(item) {
      this.editedIndex = this.desserts.indexOf(item)
      this.editedItem = Object.assign({}, item)
      this.dialog = true
    },
    deleteItem(item) {
      this.editedIndex = this.desserts.indexOf(item)
      this.editedItem = Object.assign({}, item)
      this.dialogDelete = true

    },
    deleteItemConfirm() {

      AlunoService.deleteById(this.desserts[this.editedIndex].id).then(
        response => {
          alert("Aluno Removido com Sucesso!")
          console.log(response.status);
        });
      this.desserts.splice(this.editedIndex, 1)

      this.closeDelete()
    },
    close() {

      this.dialog = false
      this.$nextTick(() => {
        this.editedItem = Object.assign({}, this.defaultItem)
        this.editedIndex = -1
      })
    },
    closeDelete() {
      this.dialogDelete = false
      this.$nextTick(() => {
        this.editedItem = Object.assign({}, this.defaultItem)
        this.editedIndex = -1
      })
    },
    save() {

      if (this.editedIndex > -1) {
        Object.assign(this.desserts[this.editedIndex], this.editedItem)

        console.log(this.editedItem)
        AlunoService.update(this.editedItem).then(
          response => {
            alert("Aluno Atualizado com Sucesso!"),
              console.log(response.status);
          }).catch(e => {
            console.log(e.response.data.message);
            alert(e.response.data.message);

          });
      } else {
        this.desserts.push(this.editedItem)
      }


      this.close()
    },
    CadastrarAluno() {
      this.$router.push({ name: 'CadastrarAluno' });
    },
  },
  mounted() {
    this.loadAll();

  }

}
</script>