job('Seed All') {
  scm {
    git ('https://github.com/robinbowes/jenkins-job-dsl-seed-all-demo.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}