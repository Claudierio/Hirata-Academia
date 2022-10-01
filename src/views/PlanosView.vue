<template>
    <div class="main-container">
      <br><br><br>
        <section class="pricing_table">
        <h1>NOSSOS PLANOS</h1>
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
              <v-divider></v-divider>
              <router-link id="" to="/CadastrarAluno">
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
              <v-divider></v-divider>
              <li><i class="fas fa-check"></i>Congelamento para férias, pausas e recessos: 30 dias.</li>
            </ul>
            <router-link id="" to="/CadastrarAluno">
                <button class="btn">Saiba Mais</button>
              </router-link>  
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
              <v-divider></v-divider>
              <li><i class="fas fa-check"></i>Congelamento para férias, pausas e recessos: 60 dias.</li>
              <li><i class="fas fa-check"></i>Aulas de Dança. *Consultar grade</li>
              <li><i class="fas fa-check"></i>Aulas de Body Combat. *Consultar grade</li>
              <li><i class="fas fa-check"></i>4 diárias ao mês para trazer um acompanhante nos treinos. *Não cumulativo</li>
            </ul>
            <router-link id="" to="/CadastrarAluno">
                <button class="btn">Saiba Mais</button>
              </router-link>  
          </div>

        </div>
      </section>
    </div>
</template>