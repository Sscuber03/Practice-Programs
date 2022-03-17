#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define ar array

vector<int> GetHIndexScore(vector<int> citations_per_paper) {
  vector<int> h_index;
  int n = citations_per_paper.size();
  int ans = 0,si = 0;
  // TODO: Calculate and return h-index score for each paper.
  priority_queue<ll, vector<ll>, greater<ll>> q;
  for(int i=0;i<n;i++)
  {
      while(q.empty()==false || q.top()<=ans)
      {
          q.pop();
          si--;
      }
      if(citations_per_paper[i]>ans)
      {
          q.push(citations_per_paper[i]);
          si++;
      }
      if(si == ans+1)
      {
          ans++;
      }
      h_index.push_back(ans);
  }
  return h_index;
}

int main() {
  int tests;
  cin >> tests;
  for (int test_case = 1; test_case <= tests; test_case++) {
    // Get number of papers for this test case
    int paper_count;
    cin >> paper_count;
    // Get number of citations for each paper
    vector<int> citations(paper_count);
    for (int i = 0; i < paper_count; i++) {
      cin >> citations[i];
    }
    vector<int> answer = GetHIndexScore(citations);
    cout << "Case #" << test_case << ": ";
    for (int i = 0; i < answer.size(); i++) {
      cout << answer[i] << " ";
    }
    cout << endl;
  }
  return 0;
}
