# [541. 反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii)

[English Version](/solution/0500-0599/0541.Reverse%20String%20II/README_EN.md)

## 题目描述

<!-- 这里写题目描述 -->

<p>给定一个字符串 <code>s</code> 和一个整数 <code>k</code>，你需要对从字符串开头算起的每隔&nbsp;<code>2k</code> 个字符的前 <code>k</code> 个字符进行反转。</p>

<ul>
	<li>如果剩余字符少于 <code>k</code> 个，则将剩余字符全部反转。</li>
	<li>如果剩余字符小于 <code>2k</code> 但大于或等于 <code>k</code> 个，则反转前 <code>k</code> 个字符，其余字符保持原样。</li>
</ul>

<p>&nbsp;</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> s = &quot;abcdefg&quot;, k = 2
<strong>输出:</strong> &quot;bacdfeg&quot;
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
	<li>该字符串只包含小写英文字母。</li>
	<li>给定字符串的长度和 <code>k</code> 在 <code>[1, 10000]</code> 范围内。</li>
</ol>

## 解法

<!-- 这里可写通用的实现逻辑 -->

<!-- tabs:start -->

### **Python3**

<!-- 这里可写当前语言的特殊实现逻辑 -->

```python
class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        t = list(s)
        for i in range(0, len(t), k << 1):
            t[i: i + k] = reversed(t[i: i + k])
        return ''.join(t)
```

### **Java**

<!-- 这里可写当前语言的特殊实现逻辑 -->

```java
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += (k << 1)) {
            for (int st = i, ed = Math.min(chars.length - 1, i + k - 1); st < ed; ++st, --ed) {
                char t = chars[st];
                chars[st] = chars[ed];
                chars[ed] = t;
            }
        }
        return new String(chars);
    }
}
```

### **C++**

```cpp
class Solution {
public:
    string reverseStr(string s, int k) {
        for (int i = 0, n = s.size(); i < n; i += (k << 1))
        {
            reverse(s.begin() + i, s.begin() + min(i + k, n));
        }
        return s;
    }
};
```

### **Go**

```go
func reverseStr(s string, k int) string {
	t := []byte(s)
	for i := 0; i < len(t); i += (k << 1) {
		for st, ed := i, min(i+k-1, len(t)-1); st < ed; st, ed = st+1, ed-1 {
			t[st], t[ed] = t[ed], t[st]
		}
	}
	return string(t)
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
```

### **...**

```

```

<!-- tabs:end -->