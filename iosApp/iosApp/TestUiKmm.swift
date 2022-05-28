import SwiftUI
import shared

struct TestUiKmm: View {
    @State var greet = "Load..."
    
    let usecase = CommonInjector().useCaseSome()
    @ObservedObject var viewModel = SomeVM()
    
    func load(){
        
        usecase.someExecute{result,error in
            if let result = result{
                self.greet = result
            } else if let error = error {
                greet = "Error \(error)"
            }
        }
    }
    
    
    var body: some View {
//        Text(greet).onAppear(){
//            load()
//        }
        Text(greet).onAppear(){
            load()
        }
    }
}

struct TestUiKmm_Previews: PreviewProvider {
    static var previews: some View {
        TestUiKmm()
    }
}
