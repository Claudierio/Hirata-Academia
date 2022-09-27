import http from "@/common/http";

class AlunoService{
    getAll() {
        return http.get('/AllAluno')
    }
    
    update(data){
        return http.get("/UpdateAluno",data)
    }
    create(data){
        return http.post('/CreateAluno', data)
    }
    deleteById(id){
        return http.delete(`/DeleteAluno/${id}`)
    }
    findById(id){
        return http.get(`/IDaluno/${id}`)
    }

}

export default new AlunoService();