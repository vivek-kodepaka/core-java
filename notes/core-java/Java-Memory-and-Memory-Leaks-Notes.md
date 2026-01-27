
# Java Memory Management & Memory Leaks  
## Interview Notes for 7+ Years Experience

## 1. Overview of Java Memory Model
Java memory is managed by the JVM, but incorrect references can still cause leaks.

Main memory areas:
- Stack
- Heap
- Metaspace
- Code Cache
- Native (Off-Heap) Memory


![java_memory_areas.png](..%2Fimages%2Fjava_memory_areas.png)

---

## 2. Stack Memory
Stores:
- Method call frames
- Local primitives
- Object references

Characteristics:
- Thread specific
- No GC
- Fast allocation

Common error:
- StackOverflowError

---

## 3. Heap Memory
Stores all objects and arrays.
Shared across threads.
Managed by Garbage Collector.

### Heap Generations
- Young (Eden, Survivor)
- Old Generation

---

## 4. Metaspace
Stores class metadata.
Uses native memory.
Common error:
- OutOfMemoryError: Metaspace

---

## 5. Code Cache
Stores JIT compiled code.
Rarely tuned.

---

## 6. Native / Off-Heap Memory
Examples:
- Direct ByteBuffers
- JNI
- Thread stacks

---

## 7. Garbage Collection Basics
GC removes unreachable objects.
Collectors: G1GC, ZGC (awareness).

---

## 8. What is a Memory Leak?
Objects no longer used but still referenced.

---

## 9. Common Causes of Memory Leaks
- Static references
- Unbounded caches
- Listeners not removed
- Non-static inner classes
- ClassLoader leaks
- ThreadLocal misuse

---

## 10. Detecting Memory Leaks
Symptoms:
- Increasing heap usage
- Frequent Full GC
- OOM after long runtime

Tools:
- jmap
- jstack
- VisualVM
- Eclipse MAT

---

## 11. Preventing Memory Leaks
- Avoid unnecessary static fields
- Use cache eviction
- Remove listeners
- Clear ThreadLocal
- Prefer static inner classes
- Close resources

---

## 12. Reference Types
- Strong
- Soft
- Weak
- Phantom

---

## 13. Interview One-Liners
- Java can leak memory despite GC
- Leaks are due to references
- Heap dump analysis is key

---

## 14. Final Takeaway
Senior Java devs should detect and reason about memory leaks effectively.
