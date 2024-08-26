import heapq
import sys
input = sys.stdin.readline

N, M, K, X = map(int, input().split())

graph = [[] for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append((1, b))

distance = [float('inf') for _ in range(N + 1)]

def dijkstra():
    q = []
    heapq.heappush(q, (0, X))
    distance[X] = 0
    
    while q:
        dist, node = heapq.heappop(q)
        if distance[node] < dist:
            continue

        for next_dist, next_node in graph[node]:
            cost = distance[node] + next_dist

            if distance[next_node] > cost:
                distance[next_node] = cost
                heapq.heappush(q, (cost, next_node))


dijkstra()

result = []
for i in range(1, N+1):
    if K == distance[i]:
        result.append(i)

if result:
    for n in result:
        print(n)
else:
    print(-1)