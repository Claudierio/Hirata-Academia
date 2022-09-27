import http from "@/common/http";

class EquipamentoService{
    getAll() {
        return http.get('/AllEquipamento')
    }

    update(data){
        return http.get("/UpdateEquipamento",data)
    }
    create(data){
        return http.post('/CreateEquipamento', data)
    }
    deleteById(id){
        return http.delete(`DeleteEquipamento/${id}`)
    }
    findById(id){
        return http.get(`/FindEquipamento/${id}`)
    }

}

export default new EquipamentoService();