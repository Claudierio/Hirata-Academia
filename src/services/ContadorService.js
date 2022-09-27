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
    updatesalario(){
        return http.get('SalarioContador/salario')
    }

}

export default new ContadorService();