/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
vector<int>arr;
void solve(ListNode*h){
    if(h==NULL) return ;
    arr.push_back(h->val);
    solve(h->next);
}
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        solve(list2);
        solve(list1);
        ListNode*ans=NULL;
        ListNode*temp=ans;
        sort(arr.begin(),arr.end());
        for(auto &i:arr){
            if(ans==NULL){
                ans=new ListNode(i);
                temp=ans;
            }else{
                temp->next=new ListNode(i);
                temp=temp->next;
            }
        }
        return ans;
    }
};
