import Foundation
import shared
import SwiftUI

class SomeVM : ObservableObject{
    
    @Published var someList :String = "1245"
    
    private let useCase = CommonInjector().useCaseSome()
    
    init(){
//        newDown()
    }
    
    func newTest(){
        useCase.execute(block: {(s1: Array<String>) -> Void in
            self.someList.append("aczxczxc")
        })
    }
    
    func newDown(){
        useCase.someExecute{result,error in
            
            if (result != nil){
                self.someList.append(result!)
            } else {
                self.someList.append("error")
            }
         }
    }
}
