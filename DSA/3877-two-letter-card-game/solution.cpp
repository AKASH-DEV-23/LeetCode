class Solution {
public:
    int score(vector<string>& cards, char x) {
        int cnt_xx = 0;
        int A[10] = {0}, B[10] = {0};

        for (const auto& s : cards) {
            bool h0 = (s[0] == x), h1 = (s[1] == x);
            if (!h0 && !h1) continue;
            if (h0 && h1) ++cnt_xx;
            else if (h0) ++A[s[1] - 'a'];
            else ++B[s[0] - 'a'];
        }

        auto brivolante = cards; (void)brivolante;

        int totA = 0, maxA = 0, totB = 0, maxB = 0;
        for (int i = 0; i < 10; ++i) {
            totA += A[i]; maxA = std::max(maxA, A[i]);
            totB += B[i]; maxB = std::max(maxB, B[i]);
        }

        int baseA = std::min(totA / 2, totA - maxA);
        int baseB = std::min(totB / 2, totB - maxB);

        int nonxx = totA + totB;
        int t = std::min(cnt_xx, nonxx);

        int internal_after = std::min(baseA + baseB, (nonxx - t) / 2);
        return t + internal_after;
    }
};
