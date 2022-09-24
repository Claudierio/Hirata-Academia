import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/AreaAluno',
    name: 'Area Aluno',
    component: () => import( '../views/Area_aluno.vue')
  },
  {
    path: '/AreaEfetivo',
    name: 'Area Efetivo',
    component: () => import( '../views/Area_Efetivo.vue')
  },

  {
    path: '/planos',
    name: 'Planos',
    component: () => import( '../views/PlanosView.vue')
  },
  {
    path: '/CadastrarProfessor',
    name: 'Cadastrar Professor',
    component: () => import( '../views/Gerencia/CadastrarProfessor.vue')
  },
  {
    path: '/ProcurarProfessor',
    name: 'Procurar Professor',
    component: () => import( '../views/Gerencia/ProcuraProfessor.vue')
  },
  {
    path: '/AtualizarProfessor',
    name: 'Atualizar Professor',
    component: () => import( '../views/Gerencia/AtualizarProfessor.vue')
  },
  {
    path: '/DemitirProfessor',
    name: 'Demitir Professor',
    component: () => import( '../views/Gerencia/DemitirProfessor.vue')
  },
  {
    path: '/CadastrarProfEstagiario',
    name: 'Cadastrar Professor Estagiario',
    component: () => import( '../views/Gerencia/CadastroProfEstagio.vue')
  },
  {
    path: '/ProcurarProfEstagiario',
    name: 'Procurar Professor Estagiario',
    component: () => import( '../views/Gerencia/ProcurarProfEstagio.vue')
  },
  {
    path: '/EfetivarProfEstagio',
    name: 'Efetivar Professor Estagiario',
    component: () => import( '../views/Gerencia/EfetivarprofEstagio.vue')
  },
  {
    path: '/DemitirProfEstagiario',
    name: 'Procurar Professor Estagiario',
    component: () => import( '../views/Gerencia/DemitirProfEstagio.vue')
  },
  {
    path: '/CadastrarAluno',
    name: 'Cadastrar Aluno',
    component: () => import( '../views/aluno/CadastrarAluno.vue')
  },
  {
    path: '/ProcurarAluno',
    name: 'Procurar Aluno',
    component: () => import( '../views/aluno/ProcurarAluno.vue')
  },
  {
    path: '/AtualizarAluno',
    name: 'Atualizar Aluno',
    component: () => import( '../views/aluno/AtualizarAluno.vue')
  },
  {
    path: '/RemoverAluno',
    name: 'Remover Aluno',
    component: () => import( '../views/aluno/RemoverAluno.vue')
  },
  {
    path: '/VisualizarFicha',
    name: 'VisualizarFichaTreino',
    component: () => import( '../views/aluno/VisualizarFichaTreino.vue')
  },
  {
    path: '/CadastrarContador',
    name: 'Cadastrar Aluno',
    component: () => import( '../views/Contador/Cadastrar_Cont.vue')
  },
  {
    path: '/ProcurarContador',
    name: 'Procurar Contador',
    component: () => import( '../views/Contador/ProcurarCont.vue')
  },
  {
    path: '/AtualizarContador',
    name: 'Atualizar Contador',
    component: () => import( '../views/Contador/AtualizarCont.vue')
  },
  {
    path: '/DemitirCont',
    name: 'Demitir Contador',
    component: () => import( '../views/Contador/DemitirCont.vue')
  },
  {
    path: '/GerenciarFicha',
    name: 'Gerenciar Ficha',
    component: () => import( '../views/Professor/GerenciarFichaTreino.vue')
  },
  

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
