package ss.rest.test

class QuestionaireController {

    def index() {

    }

    def startform() {
      if (params.id) { //user clicked previous
        def f = Form.get(params.id)
        render(view: "startform", model: [fid: f])
      }
      else { //start the form for the first time
        render (view: "startform", model: [fid: new Form()])
      }
    }

    def savestep1() {
      def q = Form.findOrCreateById(params.fid)
      q.properties = params
      if (!q.save(validate: false,flush: true)) {
          q.errors.allErrors.each { println it }
      }
      redirect(action:"startstep2", params: [fid: q.id])
    }

    def startstep2() {
      render(view: "startstep2", model: [fid: params.fid])
    }

    def savestep2() {
      def q = Form.findOrCreateById(params.fid)
      q.properties = params
      q.occupation_2 = params.occupation_2
      q.employer_2 = params.employer_2
      if (!q.save(flush: true)) {
          q.errors.allErrors.each { println it }
      }
      redirect (action: "showall")
    }

    def showall() {
      render (view: "showall", model:[all: Form.getAll()])
    }


}
