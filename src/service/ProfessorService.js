import http from "@/common/http";

class ProfessorService{
    getAll() {
        return http.get('/AllProfessor')
    }
    update(data){
        return http.get("/UpdateProfessor",data)
    }
    create(data){
        return http.post('/CreateProfessor', data)
    }
    deleteById(id){
        return http.delete(`/DeleteProfessor/${id}`)
    }
    findById(id){
        return http.get(`/FindProfessor/${id}`)
    }
    atualizar(data, id){
        return http.get(`professorEstagiario/${id}`, data)
    }

}

export default new ProfessorService();