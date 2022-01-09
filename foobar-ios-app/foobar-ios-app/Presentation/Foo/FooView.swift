import FooBarShared
import SwiftUI

struct FooView: View {
    let greet = Greeting().greeting()

    var body: some View {
        Text(greet)
    }
}

struct FooView_Previews: PreviewProvider {
    static var previews: some View {
        FooView()
    }
}
