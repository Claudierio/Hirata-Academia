import http from "@/common/http";

class FichadeTreinoService{
    getAll() {
        return http.get('/AllFichadeTreino')
    }

    update(data){
        return http.get("/UpdateFichadeTreino",data)
    }
    create(data){
        return http.post('/CreateFichadeTreino', data)
    }
    deleteById(id){
        return http.delete(`/DeleteFichadeTreino/${id}`)
    }
    findById(id){
        return http.get(`/FindFichadeTreino/${id}`)
    }

}

export default new FichadeTreinoService();