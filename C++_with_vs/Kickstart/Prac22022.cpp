#include <iostream>
#include <string>

using namespace std;

string GetRuler(const string& kingdom) {
  // TODO: implement this method to determine the ruler name, given the kingdom.
  string ruler = "";
  char ch = kingdom.at(kingdom.length()-1);
  if(ch == 'y' || ch == 'Y')
  {
      ruler = "nobody";
  }
  else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
  {
      ruler = "Alice";
  }
  else
  {
      ruler = "Bob";
  }
  return ruler;
}

int main() {
  int testcases;
  cin >> testcases;
  string kingdom;

  for (int t = 1; t <= testcases; ++t) {
    cin >> kingdom;
    cout << "Case #" << t << ": " << kingdom << " is ruled by "
         << GetRuler(kingdom) << ".\n";
  }
  return 0;
}