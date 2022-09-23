<template>
  <div>
    <Banner />
    <div class="main-container">
      <!--Aba Sobre nós-->
      <section></section>
      <section class="about">
        <div class="row">
          <div class="imagem">
            <img src="/img/4.jpg" alt="">
          </div>
          <div class="content">
            <h1>Sobre Nós</h1>
            <p>Nós da Equipe Hirata Academia acreditamos que a saúde é dos maiores componentes de qualidade de vida e com isso,acreditamos que o treinamento corretamente avaliado, prescrito e monitorado é uma das maiores fontes para nostornarmos indivíduos mais saudáveis. </p>
            <p>Pensando nisso, nosso espaço traz profissionais capacitados e engajadosa oferecer - com total responsabilidade e segurança - um atendimento de excelência e qualidade à sua vida.</p>
            <button class="btn">Vamos começar</button>
          </div>
        </div>
      </section>


      <!--Aba nossos serviços-->
      <section class="services">
        <h1>Nossos Serviços</h1>
        <div class="container">
          <div class="box">
            <img src="/img/1.jpg" alt="">
            <div class="info">
              <h3>Musculação</h3>
              <p>Contamos com uma excelente variedade de maquinários e implementos para potencializar seus treinos. Na Hirata Academia não medimos esforços e investimentos para oferecer a você o nosso melhor.</p>
              <button class="btn">Leia Mais</button>
            </div>
          </div>

          <div class="box">
            <img src="/img/2.jpg" alt="">
            <div class="info">
              <h3>Luta</h3>
              <p>Karatê, Jiu-jitsu, Capoeira, Kung Fu e Taekwondo são algumas das inspirações para a aula de Body Combat. Todos os exercícios são adaptados e selecionados pelos professores para trabalhar o corpo inteirinho. O treino é do tipo intervalado e de alta intensidade.</p>
              <button class="btn">Leia Mais</button>
            </div>
          </div>

          <div class="box">
            <img src="/img/3.jpg" alt="">
            <div class="info">
              <h3>Dança</h3>
              <p>Apesar da coreografia elaborada, na aula de FitDance só há uma regra: seguir o ritmo e se divertir. “O FitDance é para todos, os passos são adaptáveis e a prioridade é concluir o que é possível e evoluir aos poucos.</p>
              <button class="btn">Leia Mais</button>
            </div>
          </div>

        </div>
      </section>
    </div>

      <!--Aba Planos-->
      <section class="pricing_table">
        <h1>Nossos Planos</h1>
        <div class="pricing_card">
          <div class="pricing_box">
            <h2>PLANO MENSAL</h2>
            <h3><sup>$</sup>120<span>/mês</span></h3>
            <p>1 mês</p>
            <ul>
              <li><i class="fas fa-check"></i>Acesso livre de domingo a domingo e feriados.</li>
              <li><i class="fas fa-check"></i>Aulas de Ginástica Coletiva. *Consultar grade</li>
              <li><i class="fas fa-check"></i>Armários rotativos</li>
              <li><i class="fas fa-check"></i>Vestiários com duchas</li>
              <li><i class="fas fa-check"></i>Acesso ao plano de treino no site</li>
              <br><br><br><br><br><br><br><br>

              <v-divider></v-divider>
              <router-link id="" to="/planos">
                <button class="btn">Saiba Mais</button>
              </router-link>  
            </ul>
          </div>

          <div class="pricing_box">
            <h2>PLANO TRIMESTRAL</h2>
            <h3><sup>$</sup>100<span>/mês</span></h3>
            <p>3 meses</p>
            <ul>
              <li><i class="fas fa-check"></i>Acesso livre de domingo a domingo e feriados.</li>
              <li><i class="fas fa-check"></i>Aulas de Ginástica Coletiva. *Consultar grade</li>
              <li><i class="fas fa-check"></i>Armários rotativos</li>
              <li><i class="fas fa-check"></i>Vestiários com duchas</li>
              <li><i class="fas fa-check"></i>Acesso ao plano de treino no site</li>
              <li><i class="fas fa-check"></i>Mais vantagens! Clique no botão abaixo.</li>
              <br><br><br>
              <v-divider></v-divider>
              <router-link id="" to="/planos">
                <button class="btn">Saiba Mais</button>
              </router-link> 
            </ul>
          </div>

          <div class="pricing_box">
            <h2>PLANO ANUAL</h2>
            <h3><sup>$</sup>80<span>/mês</span></h3>
            <p>1 ano</p>
            <ul>
              <li><i class="far fa-check"></i>Acesso livre de domingo a domingo e feriados.</li>
              <li><i class="fas fa-check"></i>Aulas de Ginástica Coletiva. *Consultar grade</li>
              <li><i class="fas fa-check"></i>Armários rotativos</li>
              <li><i class="fas fa-check"></i>Vestiários com duchas</li>
              <li><i class="fas fa-check"></i>Acesso ao plano de treino no site</li>
              <li><i class="fas fa-check"></i>Congelamento para férias, pausas e recessos: 60 dias.</li>
              <li><i class="fas fa-check"></i>Muitas mais vantagens! Clique no botão abaixo.</li>
              <v-divider></v-divider>
              <router-link id="" to="/planos">
                <button class="btn">Saiba Mais</button>
              </router-link> 
            </ul>
          </div>

        </div>
      </section>



  </div>


</template>

<script>
import Banner from '../components/Banner'

export default {
  name: 'Home_',

  components: {
    Banner,
  }
}
</script>

<style>

    /* Aba sobre nos*/
    .about .row{
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    padding: 2% 6%;
  }

  .about .row .imagem{
    flex: 1 1 40rem;
    padding: 2rem;

  }

  .about .row .imagem img{
    width: 100%;
    height: 100%;
    object-fit: cover;
  }

  .about .row .content{
    flex: 1 1 40rem;
    padding: 2rem;
    text-align: center;

  }

  .about .row .content h1{
    display: inline-block;
    border-bottom: .3rem solid;
    font-size: 3rm;
    color: #c90707;
    margin-bottom: 5rem;
  }

  .about .row .content p{
    line-height: 1.7;
    font-size: 1.2rem;
    margin-bottom: 1.2rem;
  }

  .btn{
    padding: 0.5rem 1.5rem;
    background-color: transparent;
    border: 0.3rem solid #c90707;
    color: #c90707;
    margin-top: 1.8rem;
    cursor: pointer;
    border-radius: 0.5rem;
    font-size: 2rem;
  }


  /* Aba nossos serviços, haja coisa viu*/
  .services{
    min-height: 100vh;
    text-align: center;
    padding: 2% 6%;
  }

  .services h1{
    font-size: 3.8rem;
    padding: 0.5rem;
    display: inline-block;
    color: #c90707;
    border-bottom: .3rem solid;
    margin-bottom: 1.8rem;
  }

  .services .container{
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    flex-wrap: wrap;
  }

  .services .container .box{
    width: 31rem;
    height: 31rem;
    margin: .5rem;
    position: relative;
    overflow: hidden;
  }

  .services .container .box  img{
    width: 100%;
    height: 100%;
    object-fit: cover;
  }

  .services .container .box .info{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) scale(0);
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.7);
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
  }

  .services .container .box:hover .info{
    transform: translate(-50%, -50%) scale(1);
  }

  .services .container .box .info h3{
    font-size: 3rem;
    color: #c90707;
    margin-bottom: 1,2rem;
  }

  .services .container .box .info p{
    line-height: 2;
    color: white;
    font-size: 1.1rem;
    padding: 0 1rem;
    margin-bottom: 1.2rem;
  }    

  /*Css Aba planos */

  .pricing_table {
    min-height: 100hv;
    padding: 2% 6%;
    text-align: center;
  }
  .pricing_table h1 {
    font-size: 3.8rem;
    padding: 0.5rem;
    display: inline-block;
    color: #c90707;
    border-bottom: .3rem solid #c90707;
    margin-bottom: 2.2rem;

  }
  .pricing_table .pricing_card {
    display: flex;
    justify-content: space-around;
    align-items: center;
    flex-wrap: wrap;
    text-align: center;
  }
  .pricing_card .pricing_box {
    width: 20rem;
    box-shadow: 2px 2px 6px #000;
    margin-bottom: 4rem;
  }
  .pricing_card .pricing_box:hover {
    transform: translateY(-30px);
  }
  .pricing_box h2{
    font-size: 2rem;
    margin-bottom: 3rem;
    background-color: #c90707be;
    padding: 1.2rem;
    border-bottom-left-radius: 30%;
    border-bottom-right-radius: 30%;

  }
  .pricing_box h3{
    margin-top: 2rem;
    font-size: 4rem;
    color: #c90707;
  }
  .pricing_box h3 sup {
    font-size: 2rem;
  }
  .pricing_box h3 span {
    font-size: 2.5rem;
  }
  .pricing_box p {
    font-size: 2.5rem;
    color: #333;
  }
  .pricing_box ul {
    padding: 2rem;
  }
  .pricing_box ul li {
    margin-bottom: 0.5rem;
    font-size: 1.5rem;
  }
  .pricing_box .btn {
    margin-bottom: 2rem;
  }




</style>