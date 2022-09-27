import http from "@/common/http";

class DespesaService{
    getAll() {
        return http.get('/AllDespesa')
    }

    update(data){
        return http.get("/UpdateDespesa",data)
    }
    create(data){
        return http.post('/CreateDespesa', data)
    }
    deleteById(id){
        return http.delete(`DeleteDespesa/${id}`)
    }
    findById(id){
        return http.get(`/FindDespesa/${id}`)
    }

}

export default new DespesaService();