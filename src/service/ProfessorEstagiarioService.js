import http from "@/common/http";

class ProfessorEstagiarioService{
    getAll() {
        return http.get('/AllProfessorEstagiario')
    }
    update(data){
        return http.get("/UpdateProfessorEstagiario",data)
    }
    create(data){
        return http.post('/CreateProfessorEstagiario', data)
    }
    deleteById(id){
        return http.delete(`/DeleteProfessorEstagiario/${id}`)
    }
    findById(id){
        return http.get(`/FindProfessorEstagiario/${id}`)
    }
    efetivar(id){
        return http.get(`professorEstagiario/${id}`)
    }

}

export default new ProfessorEstagiarioService();