import http from "@/common/http";

class ContadorService{
    getAll() {
        return http.get('/AllContador')
    }
    update(data){
        return http.get("/UpdateContador",data)
    }
    create(data){
        return http.post('/CreateContador', data)
    }
    deleteById(id){
        return http.delete(`/DeleteContador/${id}`)
    }
    findById(id){
        return http.get(`contador/${id}`)
    }
    lucro(){
        return http.get('contador/lucroAnual')
    }
    totalAluno(){
        return http.get('contador/totalAlunos')
    }
    totalMensal(){
        return http.get('contador/totalMensal')
    }
    totalTrimestral(){
        return http.get('contador/totalTrimestral')
    }
    totalAnual(){
        return http.get('contador/totalAnual')
    }
    updatesalario(){
        return http.get('SalarioContador/salario')
    }

}

export default new ContadorService();