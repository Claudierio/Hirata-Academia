import http from "@/common/http";

class ModalidadeService{
    getAll() {
        return http.get('/AllModalidade')
    }
    update(data){
        return http.get("/UpdateModalidade",data)
    }
    create(data){
        return http.post('/CreateModalidade', data)
    }
    deleteById(id){
        return http.delete(`/DeleteModalidade/${id}`)
    }
    findById(id){
        return http.get(`/FindModalidade/${id}`)
    }

}

export default new ModalidadeService();