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
    name: 'AreaAluno',
    component: () => import( '../views/Area_aluno.vue')
  },
  {
    path: '/AreaEfetivo',
    name: 'AreaEfetivo',
    component: () => import( '../views/Area_Efetivo.vue')
  },

  {
    path: '/planos',
    name: 'Planos',
    component: () => import( '../views/PlanosView.vue')
  },
  {
    path: '/CadastrarProfessor',
    name: 'CadastrarProfessor',
    component: () => import( '../views/Gerencia/CadastrarProfessor.vue')
  },
  {
    path: '/ProcurarProfessor',
    name: 'ProcurarProfessor',
    component: () => import( '../views/Gerencia/ProcuraProfessor.vue')
  },
  {
    path: '/AtualizarProfessor',
    name: 'AtualizarProfessor',
    component: () => import( '../views/Gerencia/AtualizarProfessor.vue')
  },

  {
    path: '/CadastrarProfEstagiario',
    name: 'CadastrarProfessorEstagiario',
    component: () => import( '../views/Gerencia/CadastroProfEstagio.vue')
  },
  {
    path: '/ProcurarProfEstagiario',
    name: 'ProcurarProfessorEstagiario',
    component: () => import( '../views/Gerencia/ProcurarProfEstagio.vue')
  },
  {
    path: '/EfetivarProfEstagio',
    name: 'EfetivarProfessorEstagiario',
    component: () => import( '../views/Gerencia/EfetivarprofEstagio.vue')
  },

  {
    path: '/CadastrarAluno',
    name: 'CadastrarAluno',
    component: () => import( '../views/aluno/CadastrarAluno.vue')
  },
  {
    path: '/ProcurarAluno',
    name: 'ProcurarAluno',
    component: () => import( '../views/aluno/ProcurarAluno.vue')
  },
  {
    path: '/AtualizarAluno',
    name: 'AtualizarAluno',
    component: () => import( '../views/aluno/AtualizarAluno.vue')
  },

  {
    path: '/VisualizarFicha',
    name: 'VisualizarFichaTreino',
    component: () => import( '../views/aluno/VisualizarFichaTreino.vue')
  },
  {
    path: '/CadastrarContador',
    name: 'CadastrarContador',
    component: () => import( '../views/Contador/Cadastrar_Cont.vue')
  },
  {
    path: '/ProcurarContador',
    name: 'ProcurarContador',
    component: () => import( '../views/Contador/ProcurarCont.vue')
  },
  {
    path: '/AtualizarContador',
    name: 'AtualizarContador',
    component: () => import( '../views/Contador/AtualizarCont.vue')
  },

  {
    path: '/CriarFichaTreino1',
    name: 'CriarFichaTreino',
    component: () => import( '../views/Professor/CriarFichaTreino1.vue')
  },
  {
    path: '/CriarFichaTreino2',
    name: 'CriarFichaTreino2',
    component: () => import( '../views/Professor/CriarFichaTreino2.vue')
  },
  

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
