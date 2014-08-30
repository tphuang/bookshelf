(function (g) {
    function f(o, n, m) {
        if (!o) {
            return
        }
        if (Array.prototype.forEach && o.forEach) {
            o.forEach(n, m)
        } else {
            for (var k = 0, j = o.length; k < j; k++) {
                if (k in o) {
                    n.call(m, o[k], k, o)
                }
            }
        }
    }

    function b(i) {
        return Object.prototype.toString.call(i) == "[object String]"
    }

    function a(i) {
        return i === Object(i)
    }

    function e(i) {
        var j = h._global_exports[i];
        return j && j.exports
    }

    function d(o, m) {
        var l = h, i = {}, k = l._global_exports[name] || {}, n = l._ns = k.ns || l._current_ns || l._ns || "window";
        var j = [];
        f(o, function (p) {
            j.push(e(p))
        });
        i = m.apply(this, j) || {};
        return i
    }

    function h(j, m, l) {
        if (!b(j)) {
            throw new Error("Waring: definejs can't handle anonymous AMD module");
            return
        }
        if (!l) {
            l = m;
            m = []
        }
        var i = d(m, l), k = h._global_exports[j];
        if (!k) {
            throw new Error('Waring: there is no definition of "' + j + '" in define.config ?');
            return
        }
        k.exports = i;
        if (k.alias) {
            f(k.alias, function (p) {
                var q = p.split("."), o = g, n = q[0];
                if (q[1]) {
                    o = o[n] = o[n] || {};
                    n = q[1]
                }
                o[n] = i
            })
        }
    }

    function c(i, k) {
        var l = b(i);
        if (!k && l) {
            return e(i)
        }
        if (l) {
            i = [i]
        }
        var j = arguments;
        setTimeout(function () {
            d.apply(this, j)
        }, 0)
    }

    h._global_exports = {};
    h.ns = function (i, j) {
        if (!j) {
            this._ns = i
        } else {
            var k = this._global_exports;
            if (!k[i]) {
                k[i] = {alias: []}
            }
            k[i].ns = j
        }
    };
    h.config = function (i, k) {
        if (a(i)) {
            for (var l in i) {
                this.config(l, i[l])
            }
            return
        }
        var j = this._global_exports;
        if (!j[i]) {
            j[i] = {ns: this._ns, alias: []}
        }
        if (b(k)) {
            k = [k]
        }
        [].push.apply(j[i].alias, k)
    };
    h.amd = {jQuery: true};
    g.define = h;
    g.require = c
})(window);
