import networkx as nx
G = nx.gnp_random_graph(10, 0.5)
print(nx.is_connected(G))
