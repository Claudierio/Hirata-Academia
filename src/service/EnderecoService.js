import http from "@/common/http";

class EnderecoService{
    getAll() {
        return http.get('/AllEndereco')
    }

    update(data){
        return http.get("/UpdateEndereco",data)
    }
    create(data){
        return http.post('/CreateEndereco', data)
    }
    deleteById(id){
        return http.delete(`DeleteEndereco/${id}`)
    }
    findById(id){
        return http.get(`/FindEndereco/${id}`)
    }

}

export default new EnderecoService();