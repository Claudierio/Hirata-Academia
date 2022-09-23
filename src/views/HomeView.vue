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


</style>