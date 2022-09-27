import http from "@/common/http";

class ModalidadeService{
    getAll() {
        return http.get('/AllPagamento')
    }
    update(data){
        return http.get("/UpdatePagamento",data)
    }
    create(data){
        return http.post('/CreatePagamento', data)
    }
    deleteById(id){
        return http.delete(`/DeletePagamento/${id}`)
    }
    findById(id){
        return http.get(`/FindPagamento/${id}`)
    }

}

export default new ModalidadeService();