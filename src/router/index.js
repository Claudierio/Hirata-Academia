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

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
