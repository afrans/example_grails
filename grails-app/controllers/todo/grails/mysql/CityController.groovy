package todo.grails.mysql

import grails.rest.RestfulController

class CityController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CityController() {
        super(City)
    }
}
