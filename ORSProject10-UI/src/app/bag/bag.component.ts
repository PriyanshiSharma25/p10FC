import { Component, OnInit } from "@angular/core";
import { ServiceLocatorService } from "../service-locator.service";

@Component({
    selector: 'app-bag',
    templateUrl:'./bag.component.html',
    styleUrls:['./bag.component.css']
    
})
export class Bag implements OnInit {
    constructor(public locator: ServiceLocatorService) {
        
    }

    ngOnInit(){
        
    }
}